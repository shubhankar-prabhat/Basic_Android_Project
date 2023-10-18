package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageGallery extends AppCompatActivity {
        Gallery simpleGallery;
        CustomGalleryAdapter customGalleryAdapter;
        ImageView selectedImageView;
        // array of images
        int[] images = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5,
                R.drawable.image6, R.drawable.image7, R.drawable.image8, R.drawable.image9, R.drawable.image10, R.drawable.image11,
                R.drawable.image12};

        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.image_gallery);

            simpleGallery = (Gallery) findViewById(R.id.simpleGallery); // get the reference of Gallery
            selectedImageView = (ImageView) findViewById(R.id.selectedImageView); // get the reference of ImageView
            customGalleryAdapter = new CustomGalleryAdapter(getApplicationContext(), images); // initialize the adapter
            simpleGallery.setAdapter(customGalleryAdapter); // set the adapter
            simpleGallery.setSpacing(5);
            simpleGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    selectedImageView.setImageResource(images[position]);

                }
            });
        }
    }