// Generated by view binder compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.crayon.fieldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemUploadMediaBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imgClose;

  @NonNull
  public final ImageView imgUpload;

  private ItemUploadMediaBinding(@NonNull CardView rootView, @NonNull ImageView imgClose,
      @NonNull ImageView imgUpload) {
    this.rootView = rootView;
    this.imgClose = imgClose;
    this.imgUpload = imgUpload;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemUploadMediaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemUploadMediaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_upload_media, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemUploadMediaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_close;
      ImageView imgClose = rootView.findViewById(id);
      if (imgClose == null) {
        break missingId;
      }

      id = R.id.img_upload;
      ImageView imgUpload = rootView.findViewById(id);
      if (imgUpload == null) {
        break missingId;
      }

      return new ItemUploadMediaBinding((CardView) rootView, imgClose, imgUpload);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}