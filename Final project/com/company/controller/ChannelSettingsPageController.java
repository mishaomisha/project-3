package com.company.controller;

import com.company.view.ChannelSettingsPage;

public class ChannelSettingsPageController {

    ChannelSettingsPage channelSettingsPage;

    public ChannelSettingsPageController(){

        channelSettingsPage = new ChannelSettingsPage();

    }

    public ChannelSettingsPage getChannelSettingsPage() {
        return channelSettingsPage;
    }
}
