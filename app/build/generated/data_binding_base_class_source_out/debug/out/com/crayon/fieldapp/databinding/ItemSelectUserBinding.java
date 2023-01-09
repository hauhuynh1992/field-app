// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.data.remote.response.MemberResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemSelectUserBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox cbUser;

  @NonNull
  public final ImageView imgAvatar;

  @NonNull
  public final TextView txtName;

  @Bindable
  protected MemberResponse mItem;

  protected ItemSelectUserBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CheckBox cbUser, ImageView imgAvatar, TextView txtName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cbUser = cbUser;
    this.imgAvatar = imgAvatar;
    this.txtName = txtName;
  }

  public abstract void setItem(@Nullable MemberResponse item);

  @Nullable
  public MemberResponse getItem() {
    return mItem;
  }

  @NonNull
  public static ItemSelectUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_select_user, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemSelectUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemSelectUserBinding>inflateInternal(inflater, R.layout.item_select_user, root, attachToRoot, component);
  }

  @NonNull
  public static ItemSelectUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_select_user, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemSelectUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemSelectUserBinding>inflateInternal(inflater, R.layout.item_select_user, null, false, component);
  }

  public static ItemSelectUserBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemSelectUserBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemSelectUserBinding)bind(component, view, R.layout.item_select_user);
  }
}