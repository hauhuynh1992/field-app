package com.crayon.fieldapp.ui.screen.login;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static ToVerify toVerify() {
    return new ToVerify();
  }

  @NonNull
  public static NavDirections actionLoginToForgotPasswordFragment() {
    return new ActionOnlyNavDirections(R.id.action_login_to_forgotPasswordFragment);
  }

  @NonNull
  public static NavDirections actionGlobalLoginFragment() {
    return MainNavDirections.actionGlobalLoginFragment();
  }

  @NonNull
  public static NavDirections actionGlobalCameraFragment() {
    return MainNavDirections.actionGlobalCameraFragment();
  }

  public static class ToVerify implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ToVerify() {
    }

    @NonNull
    public ToVerify setPhone(@NonNull String phone) {
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("phone", phone);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("phone")) {
        String phone = (String) arguments.get("phone");
        __result.putString("phone", phone);
      } else {
        __result.putString("phone", "None");
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.to_verify;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getPhone() {
      return (String) arguments.get("phone");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ToVerify that = (ToVerify) object;
      if (arguments.containsKey("phone") != that.arguments.containsKey("phone")) {
        return false;
      }
      if (getPhone() != null ? !getPhone().equals(that.getPhone()) : that.getPhone() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ToVerify(actionId=" + getActionId() + "){"
          + "phone=" + getPhone()
          + "}";
    }
  }
}