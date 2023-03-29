// Generated by view binder compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crayon.fieldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemFilterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView icNext;

  @NonNull
  public final RelativeLayout rlTitle;

  @NonNull
  public final TextView txtName;

  @NonNull
  public final TextView txtResultFilter;

  private ItemFilterBinding(@NonNull RelativeLayout rootView, @NonNull ImageView icNext,
      @NonNull RelativeLayout rlTitle, @NonNull TextView txtName,
      @NonNull TextView txtResultFilter) {
    this.rootView = rootView;
    this.icNext = icNext;
    this.rlTitle = rlTitle;
    this.txtName = txtName;
    this.txtResultFilter = txtResultFilter;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemFilterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_filter, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemFilterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ic_next;
      ImageView icNext = rootView.findViewById(id);
      if (icNext == null) {
        break missingId;
      }

      id = R.id.rl_title;
      RelativeLayout rlTitle = rootView.findViewById(id);
      if (rlTitle == null) {
        break missingId;
      }

      id = R.id.txt_name;
      TextView txtName = rootView.findViewById(id);
      if (txtName == null) {
        break missingId;
      }

      id = R.id.txt_result_filter;
      TextView txtResultFilter = rootView.findViewById(id);
      if (txtResultFilter == null) {
        break missingId;
      }

      return new ItemFilterBinding((RelativeLayout) rootView, icNext, rlTitle, txtName,
          txtResultFilter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}