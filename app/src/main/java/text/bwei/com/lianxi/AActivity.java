package text.bwei.com.lianxi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AActivity extends Fragment {

    private View view;
    private Button AtB, AtC, AtD;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = View.inflate(getActivity(), R.layout.activity_a, null);
        Log.d("**********A", "onCreateView()");
        AtB();
        AtC();
        AtD();
        return view;
    }

    public void AtB() {
        AtB = (Button) view.findViewById(R.id.AtB);
        AtB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("fragment", 1);
                startActivity(intent);
            }
        });
    }

    public void AtC() {
        AtC = (Button) view.findViewById(R.id.AtC);
        AtC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MainActivity.class);
                intent.putExtra("fragment", 2);
                startActivity(intent);
            }
        });
    }

    public void AtD() {
        AtD = (Button) view.findViewById(R.id.AtD);
        AtD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("**********A", "onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("**********A", "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("**********A", "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("**********A", "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("**********A", "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("**********A", "onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("**********A", "onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("**********A", "onDetach()");
    }
}
