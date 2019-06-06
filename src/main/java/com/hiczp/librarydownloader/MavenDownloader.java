package com.hiczp.librarydownloader;

import java.io.File;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

class MavenDownloader {
    static void download(Logger logger, String pluginName, File storageDirectory, ProjectObjectModel projectObjectModel) {
        logger.info("Start resolve dependencies for " + pluginName);
        logger.log(
                Level.FINE, "Resolve dependencies in repositories: " +
                        projectObjectModel.getDependencies().stream()
                                .map(Dependency::toString)
                                .collect(Collectors.joining(", "))
        );
        Set<Dependency> dependencies = new HashSet<>();
        projectObjectModel.getDependencies().forEach(dependency -> {
            //String.format("%s/%s/%s/%s",projectObjectModel.getRepositories());
        });
    }
}
