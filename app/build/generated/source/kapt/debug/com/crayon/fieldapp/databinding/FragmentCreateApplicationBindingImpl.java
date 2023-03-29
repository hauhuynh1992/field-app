package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCreateApplicationBindingImpl extends FragmentCreateApplicationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_toolbar, 1);
        sViewsWithIds.put(R.id.tv_title, 2);
        sViewsWithIds.put(R.id.imb_ic_back, 3);
        sViewsWithIds.put(R.id.imb_ic_filter, 4);
        sViewsWithIds.put(R.id.sp_agency, 5);
        sViewsWithIds.put(R.id.sp_project, 6);
        sViewsWithIds.put(R.id.sp_type, 7);
        sViewsWithIds.put(R.id.tv_replacement, 8);
        sViewsWithIds.put(R.id.sp_replacement, 9);
        sViewsWithIds.put(R.id.tv_job, 10);
        sViewsWithIds.put(R.id.sp_job, 11);
        sViewsWithIds.put(R.id.ll_phone, 12);
        sViewsWithIds.put(R.id.edt_phone, 13);
        sViewsWithIds.put(R.id.txt_date, 14);
        sViewsWithIds.put(R.id.edt_reason, 15);
        sViewsWithIds.put(R.id.pb_loading, 16);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCreateApplicationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentCreateApplicationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[15]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.ProgressBar) bindings[16]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.Spinner) bindings[5]
            , (android.widget.Spinner) bindings[11]
            , (android.widget.Spinner) bindings[6]
            , (android.widget.Spinner) bindings[9]
            , (android.widget.Spinner) bindings[7]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[14]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.crayon.fieldapp.ui.screen.createApplication.CreateApplicationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.createApplication.CreateApplicationViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}