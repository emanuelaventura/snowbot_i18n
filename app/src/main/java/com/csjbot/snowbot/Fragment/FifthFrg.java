package com.csjbot.snowbot.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.core.entry.Static;
import com.csjbot.snowbot.R;
import com.csjbot.snowbot_rogue.app.CsjSpeechSynthesizer;

import butterknife.OnClick;

/**
 * @Author: jl
 * @Date: 2016/12/15
 * @Desc:
 */

public class FifthFrg extends BaseFrg {


    @Override
    public int getContentViewId() {
        return R.layout.frag_fifth_layout;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @OnClick({R.id.yes_btn})
    public void onClick(View view) {
        if (null == onClickLister) {
            return;
        }
        switch (view.getId()) {
            case R.id.yes_btn:
                onClickLister.clickYes();
                break;
        }
    }

    @Override
    protected void onVisible() {
        super.onVisible();
        CsjSpeechSynthesizer.getSynthesizer().startSpeaking(Static.CONTEXT.getResources().getString(R.string.snowbot_appDownload), null);
    }

    @Override
    protected void onInvisible() {
        super.onInvisible();
        CsjSpeechSynthesizer.getSynthesizer().stopSpeaking();
    }
}
