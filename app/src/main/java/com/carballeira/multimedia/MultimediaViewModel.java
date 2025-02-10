package com.carballeira.multimedia;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MultimediaViewModel extends ViewModel {
    private MutableLiveData<List<MultmediaModel>> list = new MutableLiveData<>(null);

    public void fillList(){
        List<MultmediaModel> mediaList = new ArrayList<>();
        mediaList.add(new MultmediaModel("Audio1","Sample audio num 1",R.drawable.img1,R.raw.erika_marimba_ringtone, MultmediaModel.MediaType.AUDIO));
        mediaList.add(new MultmediaModel("Video1","Sample video num 1",R.drawable.img1,R.raw.video1, MultmediaModel.MediaType.VIDEO));
        mediaList.add(new MultmediaModel("Video1","Sample web num 1",R.drawable.img1,"https://www.google.com/", MultmediaModel.MediaType.WEB));
    }

    public MutableLiveData<List<MultmediaModel>> getList() {
        return this.list;
    }

    public void setList(List<MultmediaModel> list) {
        this.list.setValue(list);
    }

}
