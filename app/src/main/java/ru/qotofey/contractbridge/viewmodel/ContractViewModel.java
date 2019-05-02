package ru.qotofey.contractbridge.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import ru.qotofey.contractbridge.db.entity.Contract;

public class ContractViewModel extends ViewModel {

    private MutableLiveData<Contract> mData;

    public MutableLiveData<Contract> getData() {
        if (mData == null) {
            mData = new MutableLiveData<>();
            loadData();
        }
        return mData;
    }

    private void loadData() {
//        dataRepository.loadData(new Callback<Contract>() {
//            @Override
//            public void onLoad(Contract c) {
//                data.postValue(c);
//            }
//        });
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
