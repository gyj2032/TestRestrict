package com.yjguo.test;

import androidx.annotation.RestrictTo;

public class Test {

    @RestrictTo(RestrictTo.Scope.LIBRARY)
    public void library() {
        System.out.println("library");
    }

    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    public void libraryGroup() {
        System.out.println("libraryGroup");
    }

    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP_PREFIX)
    public void libraryGroupPrefix() {
        System.out.println("libraryGroupPrefix");
    }

    @RestrictTo(RestrictTo.Scope.SUBCLASSES)
    public void subclasses() {
        System.out.println("subclasses");
    }

    @RestrictTo(RestrictTo.Scope.TESTS)
    public void tests() {
        System.out.println("tests");
    }
}
