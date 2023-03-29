package com.crayon.fieldapp.ui.screen.detailTask.changeGift;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ChangeGiftFragmentDirections {
  private ChangeGiftFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionChangeGiftFragmentToAddCustomerFragment() {
    return new ActionOnlyNavDirections(R.id.action_changeGiftFragment_to_addCustomerFragment);
  }

  @NonNull
  public static NavDirections actionChangeGiftFragmentToDetailCustomerFragment() {
    return new ActionOnlyNavDirections(R.id.action_changeGiftFragment_to_detailCustomerFragment);
  }

  @NonNull
  public static NavDirections actionChangeGiftFragmentToImportGiftFragment() {
    return new ActionOnlyNavDirections(R.id.action_changeGiftFragment_to_importGiftFragment);
  }

  @NonNull
  public static NavDirections actionChangeGiftFragmentToExportGiftFragment() {
    return new ActionOnlyNavDirections(R.id.action_changeGiftFragment_to_exportGiftFragment);
  }

  @NonNull
  public static NavDirections actionGlobalLoginFragment() {
    return MainNavDirections.actionGlobalLoginFragment();
  }

  @NonNull
  public static NavDirections actionGlobalCameraFragment() {
    return MainNavDirections.actionGlobalCameraFragment();
  }
}