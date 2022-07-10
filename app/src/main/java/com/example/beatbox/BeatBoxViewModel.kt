package com.example.beatbox

import android.content.res.AssetManager
import androidx.lifecycle.ViewModel

class BeatBoxViewModel constructor(val assets: AssetManager): ViewModel() {
    var beatBox = BeatBox(assets)

    override fun onCleared() {
        super.onCleared()
        beatBox.release()
    }

}