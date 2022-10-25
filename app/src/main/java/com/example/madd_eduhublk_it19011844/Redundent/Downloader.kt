//IT19011844-Hemachandra M.G.S.P.- Assignment Component

package com.example.madd_eduhublk_it19011844.Redundent


import android.util.Log
import com.google.firebase.storage.FirebaseStorage
import java.io.File


open class Downloader {
    fun downloadFile(fileURL: String, filename: File) {

        val httpsReference = FirebaseStorage.getInstance().getReferenceFromUrl(fileURL)

        httpsReference.getFile(filename).addOnSuccessListener {
//            Toast.makeText(,"File is successfully downloaded",Toast.LENGTH_LONG).show()
            Log.d("chetan","File is successfully downloaded")
        }.addOnFailureListener{exception ->
            Log.d("chetan","Downloading Failed : ${exception.message}")
        }
    }


}