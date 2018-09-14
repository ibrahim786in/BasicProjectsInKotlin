package com.example.ibrahim.task1

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_different_layouts_test.*

class DifferentLayoutsTest : AppCompatActivity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_different_layouts_test)

        textSendBtn.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, basicTextSend.text.toString())
            intent.type = "text/plain"
//             startActivity(intent) // For default title of Action
            startActivity(Intent.createChooser(intent, "Custom Title")) //
        }
        cameraButton.setOnClickListener {
            val img = "content:///storage/0000-0000/Download/images"

            val intent = Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA)
//            intent.putExtra(MediaStore.EXTRA_OUTPUT,
//                    Uri.withAppendedPath(mLocationForPhotos, targetFilename))
            if (intent.resolveActivity(packageManager) != null) {
                startActivityForResult(intent,1)
            }
        }
        contactBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = ContactsContract.Contacts.CONTENT_TYPE
            if (intent.resolveActivity(packageManager) != null) {
                startActivityForResult(intent,1)
            }
        }
    }
}

/*   val intent = Intent(MediaStore.INTENT_ACTION_STILL_IMAGE_CAMERA)
   intent.action = Intent.ACTION_SEND
   intent.putExtra(Intent.EXTRA_STREAM, img)

//            intent.action=Intent.ACTION_CAMERA_BUTTON
   intent.type="image/*"
//        startActivity(intent)
   startActivity(Intent.createChooser(intent,"Custom Send Image Title")) // For the Custom Title
*/