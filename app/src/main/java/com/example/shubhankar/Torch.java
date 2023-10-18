package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Torch extends AppCompatActivity {

    CameraManager CameraManager;
    String CameraId;
    ToggleButton toggleButton;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.torch);

        boolean TorchAvailable =getApplicationContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT);

        CameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try{
            CameraId = CameraManager.getCameraIdList()[0];
        }
        catch (CameraAccessException e) {
            e.printStackTrace();
        }

        toggleButton = findViewById(R.id.flash);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                switchFlashLight(isChecked);
            }
        });
    }
    private void switchFlashLight(boolean isChecked) {
        try{
            CameraManager.setTorchMode(CameraId,isChecked);
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }
    }
}