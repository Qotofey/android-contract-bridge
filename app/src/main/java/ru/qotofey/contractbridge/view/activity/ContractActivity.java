package ru.qotofey.contractbridge.view.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.qotofey.contractbridge.MyServer;
import ru.qotofey.contractbridge.R;
import ru.qotofey.contractbridge.view.fragment.ContractFragment;
public class ContractActivity extends AppCompatActivity {

    private MyServer mMyServer = new MyServer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contract);
        getLifecycle().addObserver(mMyServer);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if (fragment == null) {
            fragment = new ContractFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }

    }
}
