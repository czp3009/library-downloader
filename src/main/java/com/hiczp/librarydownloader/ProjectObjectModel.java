package com.hiczp.librarydownloader;

import java.util.HashSet;
import java.util.Set;

public class ProjectObjectModel {
    private final Set<String> repositories = new HashSet<>();
    private final Set<Dependency> dependencies = new HashSet<>();

    {
        repositories.add("https://repo.maven.apache.org/maven2");
    }

    ProjectObjectModel addRepository(final String repository) {
        repositories.add(repository);
        return this;
    }

    ProjectObjectModel addDependency(final Dependency dependency) {
        dependencies.add(dependency);
        return this;
    }

    ProjectObjectModel addDependency(final String groupId, final String artifactId, final String version) {
        return addDependency(new Dependency(groupId, artifactId, version));
    }

    public Set<String> getRepositories() {
        return repositories;
    }

    public Set<Dependency> getDependencies() {
        return dependencies;
    }
}
