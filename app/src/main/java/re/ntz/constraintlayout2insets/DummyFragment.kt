package re.ntz.constraintlayout2insets

import android.os.Bundle
import android.view.View
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_dummy.*

class DummyFragment : Fragment(R.layout.fragment_dummy) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        toolbar.setNavigationOnClickListener {
            requireFragmentManager().popBackStack()
        }

        toolbar.setOnApplyWindowInsetsListener { _, insets ->
            toolbar.updatePadding(top = insets.systemWindowInsetTop)
            insets
        }
        toolbar.requestApplyInsets()
    }

    companion object {
        fun newInstance(): DummyFragment = DummyFragment()
    }
}
