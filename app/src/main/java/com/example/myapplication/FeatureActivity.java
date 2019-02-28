package com.example.myapplication;

public class FeatureActivity {
    private int a;
    private float b;
    private String c;

    public FeatureActivity(int a, float b, String c){
        //constructor
        a = a;
        b = b;
        c = c;
        /*
        CONCLUSION :
        الحمد لله
        As an astuce for well managing the version of your project, it is recommanded to c
        create a new branch for each feature you want to include.
        the syntax you can use in your terminal is :
        git branch new_branch_name    -----|
                                           |-----> git checkout -b new_branch_name
        git checkout new_branch_name  -----|
        To show a list of branches in your repository you can run the command
        git branch #with no arguments
        After creating the feature activity,
        I added the work to the staging area : Working directory -------> Staging area
        by running the command : git add $FILE_PATH (Ctrl + Shift + C),
        To check the changes add to your Staging area you can run the command :
        git diff --staged
        and then it's time to commit the changes (Staging area -------> Repository)
        run the command : git commit
        Now the changes are commited, to see a list of recent commits and their informations
        including commit ID's you can run the command : git log #with no arguments

        PROBLEM OCCURED :
        To join the two devlopment histories (master and new_feature) together,
        located on the new_feature branch I run the command :
        git merge -m --edit master new_feature
        And this resulted :
        branch master contains the 2 first commits and without the new_feature commit
        branch new_feature contains 4 commits (from old to recent) :
            - بسم الله الرحمن الرحيم
            - Create first class MainActivity
            - Create FeatureActivity
            - --edit
        git merge -m will merge the two branches and autocommit.
        so what happened is that the -m option requires a message : git merge -m <msg>
        and the --edit option was taken as the <msg>.
        THE SOLUTION
        1 - checkout master branch
        2 - run command : git merge -m 'message' --edit second_feature
        I tried the new solution by commiting the current conclusion in a new branch called
        second_feature and then merging the two version (master and second_feature together).
        */
    }
}
