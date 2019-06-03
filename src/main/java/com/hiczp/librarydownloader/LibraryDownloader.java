package com.hiczp.librarydownloader;

import org.bukkit.plugin.java.JavaPlugin;

public class LibraryDownloader extends JavaPlugin {
    private static LibraryDownloader instance;

    public static LibraryDownloader getInstance() {
        return instance;
    }

    @Override
    public void onLoad() {
        instance = this;
    }

    public void resolve() {

    }
}
