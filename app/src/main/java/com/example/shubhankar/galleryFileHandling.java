package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class galleryFileHandling extends AppCompatActivity {

    ImageView image, imageGet;
    String url = "", savePath = "";
    Button btnsave, btnGet;

    Uri downloadUri;
    RelativeLayout rlImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_file_handling);

        url = "https://patelspin.com/patel_spin_app/images/photo/1693830750611.png";
        image = findViewById(R.id.image);
        btnsave = findViewById(R.id.btnsave);
        rlImage = findViewById(R.id.rlImage);
        btnGet = findViewById(R.id.btnGet);
        Picasso.get().load(url).into(image);
        imageGet = findViewById(R.id.imageGet);


        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveImage();
            }
        });

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getImage();
            }
        });

    }


    public void getImage() {
        Log.e("Main: ", "Get Image Path: " + savePath);


        Glide.with(this)
                .load(new File(savePath))
                .apply(new RequestOptions()); // Specify a placeholder image .error(R.drawable.dummy)) // Specify an error image .into(imageGet);

    }

    public void saveImage() {
        rlImage.setDrawingCacheEnabled(true);
        Bitmap bitmap = rlImage.getDrawingCache();
        // Bitmap waterBitmap = addWaterMark(bitmap); File file, f;
        if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
            File file = new File(Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_PICTURES
            ), "ImageDemo");
            if (!file.exists()) {
                file.mkdirs();
            }
            File f = new File(file.getAbsolutePath() + File.separator + System.currentTimeMillis() + ".png");
            Log.e("Main: ", "Save Image URI: " + f);
            scanner(file.getAbsolutePath() + File.separator + System.currentTimeMillis() + ".png", "Demo");
            sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, Uri.fromFile(file)));
            FileOutputStream ostream = null;
            try {
                ostream = new FileOutputStream(f);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, ostream);
                try {
                    ostream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }


    private void scanner(String path, String tag) {
        MediaScannerConnection.scanFile(galleryFileHandling.this,
                new String[]{path}, null,
                new MediaScannerConnection.OnScanCompletedListener() {
                    public void onScanCompleted(String path, Uri uri) {
                        downloadUri = uri;
                        Log.e("Main: ", "Send ImageUri: " + downloadUri);
                        Log.e("Main: ", "Send ImagePath: " + path);
                        savePath = path;
                    }
                });
    }


}