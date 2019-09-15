package jag.chintu.shiva.forum;

import android.view.animation.*;
import android.graphics.*;

public class FlipCardAnimation extends Animation
{
    private boolean isContentChange;
    private OnContentChangeListener listener;
    private Camera mCamera;
    private final float mCenterX;
    private final float mCenterY;
    private final float mFromDegrees;
    private final float mToDegrees;
    
    public FlipCardAnimation(final float mFromDegrees, final float mToDegrees, final float mCenterX, final float mCenterY) {
        this.isContentChange = false;
        this.mFromDegrees = mFromDegrees;
        this.mToDegrees = mToDegrees;
        this.mCenterX = mCenterX;
        this.mCenterY = mCenterY;
    }
    
    protected void applyTransformation(float n, final Transformation transformation) {
        final float mFromDegrees = this.mFromDegrees;
        final float n2 = mFromDegrees + (this.mToDegrees - mFromDegrees) * n;
        final float mCenterX = this.mCenterX;
        final float mCenterY = this.mCenterY;
        final Camera mCamera = this.mCamera;
        final Matrix matrix = transformation.getMatrix();
        mCamera.save();
        Label_0102: {
            if (n2 <= 90.0f) {
                n = n2;
                if (n2 >= -90.0f) {
                    break Label_0102;
                }
            }
            if (!this.isContentChange) {
                if (this.listener != null) {
                    this.listener.contentChange();
                }
                this.isContentChange = true;
            }
            if (n2 > 0.0f) {
                n = 270.0f + n2 - 90.0f;
            }
            else {
                n = n2;
                if (n2 < 0.0f) {
                    n = -270.0f + (90.0f + n2);
                }
            }
        }
        mCamera.rotateX(n);
        mCamera.getMatrix(matrix);
        mCamera.restore();
        matrix.preTranslate(-mCenterX, -mCenterY);
        matrix.postTranslate(mCenterX, mCenterY);
    }
    
    public void initialize(final int n, final int n2, final int n3, final int n4) {
        super.initialize(n, n2, n3, n4);
        this.mCamera = new Camera();
    }
    
    public void setCanContentChange() {
        this.isContentChange = false;
    }
    
    public void setOnContentChangeListener(final OnContentChangeListener listener) {
        this.listener = listener;
    }
    
    public interface OnContentChangeListener
    {
        void contentChange();
    }
}
