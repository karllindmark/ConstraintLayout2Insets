# ConstraintLayout2Insets
Repo to visualize the difference between `2.0.0-beta4` and `2.0.1` versions while trying to apply insets

## Steps to reproduce

1) Open the app
2) Note that the toolbar is spanning under the status bar correctly
3) Tap "Next" in the toolbar to navigate to a dummy fragment
4) Pop back (hardware back/toolbar cross) to the previous fragment
5) Note that the toolbar is... well, it all depends on which version of the library you're using. Check out these screenshots for the differences:

### 2.0.0-BETA4
![ML_2 0 0_beta4](https://user-images.githubusercontent.com/979152/91962289-9bf2ea00-ed0c-11ea-92c7-3a5701a6ba7b.png)

### 2.0.1 (without `requestLayout()` in the insets handling)
![ML_2 0 1_without_requestLayout](https://user-images.githubusercontent.com/979152/91962295-9c8b8080-ed0c-11ea-961f-bb1061234bba.png)

### 2.0.1 (with `requestLayout()` uncommented)
![ML_2 0 1_with_requestLayout](https://user-images.githubusercontent.com/979152/91962292-9c8b8080-ed0c-11ea-91be-c54f27d040ec.png)
