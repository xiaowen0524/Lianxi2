package text.bwei.com.lianxi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CActivity extends Fragment {

    private View view;
    private Button CtA, CtB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.activity_c, null);
        Log.d("**********C", "onCreateView()");
        CtA();
        CtB();
        return view;
    }

    public void CtA() {
        CtA = (Button) view.findViewById(R.id.CtA);
        CtA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("fragment", 0);
                startActivity(intent);
            }
        });
    }

    public void CtB() {
        CtB = (Button) view.findViewById(R.id.CtB);
        CtB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("fragment", 1);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("**********C", "onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("**********C", "onCreate()");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("**********C", "onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("**********C", "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("**********C", "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("**********C", "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("**********C", "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("**********C", "onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("**********C", "onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("**********C", "onDetach()");
    }
}
