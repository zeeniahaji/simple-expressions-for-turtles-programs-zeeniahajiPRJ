## Turtles Language Expressions and Meta-Models

Extend your Turtles program with support for simple expressions. In particular, you should support expressions with addition and multiplication over int values or variable references wherever integers and variable references are available, e.g., loop statement headers and move statements.

Some examples of newly supported expressions are `backward(10 + x * x)` for a variable `x` and also `forward(10 + (0 * (9+1)))`.

Below is the current meta-model:

<img src="turtles class diagram_before.jpg">

Use return statements and attribute names to shape your extended meta-model as shown below:

<img src="turtles class diagram_after.jpg">

Eventually, the autograding should pass and assign 30/30.

## Doing this activity

There are two ways to do this activity:

1. You can check out the repository and import the projects into Eclipse, then do the activity there. Commit your changes and push them back to GitHub to trigger the autograding so you can see whether you've correctly implemented the grammar. More information about checking out and editing code in Eclipse can be found on KEATS.
2. You can do this activity in your browser.

   Due to an annoying, long-standing GitHub Classroom bug, you need a small extra step for this:

    1. Copy the URL of your repository (see the location bar of your browser).
    2. Open [this form](https://7ccsmmdd.github.io/) and paste your repository URL into the corresponding field.
    3. The URL field should fill with a long complicated URL as soon as you move out of the text field. 
    4. Click on the button at the bottom of the form to open that URL in a new tab: this is the MDENet Education Platform with the activity pre-loaded. You can edit your grammar and test out the changes you have made by generating an editor. See the video on KEATS to find out how to do this. **Note that you must save your changes before switching to the generated editor or you will lose them.** Saving your changes will create a commit in your repository, which will also automatically trigger the autograding process.

