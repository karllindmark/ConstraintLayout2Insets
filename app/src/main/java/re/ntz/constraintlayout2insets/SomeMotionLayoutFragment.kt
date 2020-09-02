package re.ntz.constraintlayout2insets

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_some_motionlayout.*

class SomeMotionLayoutFragment : Fragment(R.layout.fragment_some_motionlayout) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.menu.add("Next").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)
        toolbar.setOnMenuItemClickListener {
            requireFragmentManager()
                .beginTransaction()
                .replace(R.id.root, DummyFragment.newInstance())
                .addToBackStack(null)
                .commit()
            true
        }

        view.setOnApplyWindowInsetsListener { _, insets ->
            toolbar.updatePadding(top = insets.systemWindowInsetTop)
            // FIXME: Uncomment the line below to get it working in 2.0.1
            // view.requestLayout()
            insets
        }
        view.requestApplyInsets()
    }

    companion object {
        fun newInstance(): SomeMotionLayoutFragment = SomeMotionLayoutFragment()
    }
}
