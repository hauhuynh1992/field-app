// Generated by view binder compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crayon.fieldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTodayShiftBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView txtProjectName;

  @NonNull
  public final TextView txtShift;

  @NonNull
  public final TextView txtTimekeeping;

  private ItemTodayShiftBinding(@NonNull LinearLayout rootView, @NonNull TextView txtProjectName,
      @NonNull TextView txtShift, @NonNull TextView txtTimekeeping) {
    this.rootView = rootView;
    this.txtProjectName = txtProjectName;
    this.txtShift = txtShift;
    this.txtTimekeeping = txtTimekeeping;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTodayShiftBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTodayShiftBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_today_shift, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTodayShiftBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.txt_project_name;
      TextView txtProjectName = rootView.findViewById(id);
      if (txtProjectName == null) {
        break missingId;
      }

      id = R.id.txt_shift;
      TextView txtShift = rootView.findViewById(id);
      if (txtShift == null) {
        break missingId;
      }

      id = R.id.txt_timekeeping;
      TextView txtTimekeeping = rootView.findViewById(id);
      if (txtTimekeeping == null) {
        break missingId;
      }

      return new ItemTodayShiftBinding((LinearLayout) rootView, txtProjectName, txtShift,
          txtTimekeeping);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}