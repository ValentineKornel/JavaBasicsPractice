package com.epam.rd.autotasks.sprintplanning.tickets;
import java.util.Arrays;

public class UserStory extends Ticket {
    private final UserStory[] dependencies;

    public UserStory(int id, String name, int estimate, UserStory... dependsOn) {
        super(id, name, estimate);
        dependencies = new UserStory[dependsOn.length];
        System.arraycopy(dependsOn, 0, dependencies, 0, dependsOn.length);
    }

    @Override
    public void complete() {
        boolean ifAllowedToComplete = true;
        for (UserStory story: dependencies){
            if (!story.ifCompleted)
                ifAllowedToComplete = false;
        }
        if(ifAllowedToComplete)
            ifCompleted = true;
    }

    public UserStory[] getDependencies() {
        return Arrays.copyOf(dependencies, dependencies.length);
    }

    @Override
    public String toString() {
        return "[US " + id + "] " + name;
    }
}
