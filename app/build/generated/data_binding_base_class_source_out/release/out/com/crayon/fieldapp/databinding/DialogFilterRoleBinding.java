// Generated by view binder compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.crayon.fieldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogFilterRoleBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final Button btnChoose;

  @NonNull
  public final Button btnClearAll;

  @NonNull
  public final CheckBox cbSelectAll;

  @NonNull
  public final RecyclerView rvStore;

  private DialogFilterRoleBinding(@NonNull LinearLayout rootView, @NonNull Button btnCancel,
      @NonNull Button btnChoose, @NonNull Button btnClearAll, @NonNull CheckBox cbSelectAll,
      @NonNull RecyclerView rvStore) {
    this.rootView = rootView;
    this.btnCancel = btnCancel;
    this.btnChoose = btnChoose;
    this.btnClearAll = btnClearAll;
    this.cbSelectAll = cbSelectAll;
    this.rvStore = rvStore;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogFilterRoleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogFilterRoleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_filter_role, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogFilterRoleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cancel;
      Button btnCancel = rootView.findViewById(id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.btn_choose;
      Button btnChoose = rootView.findViewById(id);
      if (btnChoose == null) {
        break missingId;
      }

      id = R.id.btn_clear_all;
      Button btnClearAll = rootView.findViewById(id);
      if (btnClearAll == null) {
        break missingId;
      }

      id = R.id.cb_select_all;
      CheckBox cbSelectAll = rootView.findViewById(id);
      if (cbSelectAll == null) {
        break missingId;
      }

      id = R.id.rv_store;
      RecyclerView rvStore = rootView.findViewById(id);
      if (rvStore == null) {
        break missingId;
      }

      return new DialogFilterRoleBinding((LinearLayout) rootView, btnCancel, btnChoose, btnClearAll,
          cbSelectAll, rvStore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}