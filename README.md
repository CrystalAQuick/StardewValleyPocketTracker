# SV Go

## Description
This is a fan-made project.
Stardew Valley Go (SV Go) keeps track of calender events in Stardew Valley.
The app also keeps track of items that the user has acquired.

## Purpose
This is an android application that is being created to gain experience developing android
applications written in Java, using git, solidifying programming fundamentals, and designing
an application from markup to deployment.

## Code Best Practices
  * SV Go shall be written in Java.
  * Application shall be written with strong variable typing.
     * This is to build good coding practices, and to have code written as explicit as possible.
  * Each line shall have a 100 character limit.
     * This is to improve code readability as it is easier to read code in a digestible format and
     allows code to be diffed without excessive scrolling.
  * Each variable name shall be written with a meaning naming convention and use the correct prefix
  where required.
     * This is to help improve code readability.
  * Code shall be properly formatted.
     * This is to maintain consistency throughout all of the code files.
  * Developing shall be TDD. (Test-Driven Development)
     *  Every feature introduced will be thoroughly tested using unit testing as well as
     instrumented testing. We will have a minimum of 80% target code coverage. This is to give us
     confidence that we have tested thoroughly, and will reduce tests that do not provide value,
     or are hard to test.
  * Each method that is created shall have a single responsibility and will reuse code when possible
     * This ensures that code remains easily testable and is not cumbersome to debug.

## Screenshots
These mockups will be replaced with screenshots as features are implemented. All mocks are subject to change as necessary.

| Screenshot | Content |
| ---------- | ------- |
![Main Activity](/app/src/main/res/ui-mocks/MainActivity.png "Main Activity") | **Home Screen** - The home screen is the default landing page. It will have the app logo, buttons leading to the app's two primary features (Event Viewer and Checklist). The settings button is universally accessible.
![Settings Activity](/app/src/main/res/ui-mocks/Settings.png "Settings Activity") | **Settings Screen** - The settings screen is accessible from all activities. When returning from it, the previously viewed activity is displayed. Some settings may be set based on the user activity, such as their event viewer preference. All settings are applied immediately and persist between sessions. If the user chooses to clear all preferences or reset data, they will be asked to confirm.
![Events Screen Calendar](/app/src/main/res/ui-mocks/Events_CalendarView.png "Events Activity - Calendar View") ![Events Screen List](/app/src/main/res/ui-mocks/Events_ListView.png "Events Activity - List View") | **Events Screen** - The events screen displays all calendar events in a calendar or list view (pictured below). The user's view preference and last visited month (or first expanded, in list view) is stored as a preference and retrieved when the window is revisited.
![Checklist Screen](/app/src/main/res/ui-mocks/Checklist.png "Checklist Activity") | **Checklist Screen** - The checklist screen displays all bundle requests. Users can track their progress for each individually, and their progress is retained between sessions. The tracker supports both single-item requests (checklist) and multi-item requests (numeric control).
![Dialog](/app/src/main/res/ui-mocks/DetailsDialog.png "Details Dialog") | **Details Dialog (Post-MVP Feature)** - The details dialog will display when the user taps an item in the events and checklist screens. It will display additional information about the item tapped and can be dismissed by tapping Close or outside the dialog. Some settings options will display a dialog requesting confirmation before the operation is performed.

## Installation
Android version 4.0.3 (Ice Cream Sandwich) or higher is required.
Download for FREE on Google Play <insert link to app store>

## Usage
<insert visual example of apps functionality?>

## Authors and Acknowledgment
### Developers
  * CrystalAQuick
  * assassinsgreed
  
### Licensing
  * Icons made by [Smashicons](https://www.flaticon.com/authors/smashicons) from [www.flaticon.com](https://www.flaticon.com)

### Tooling
  * [Discord Hooks](https://github.com/DiscordHooks/travis-ci-discord-webhook) by K34n31p4nic
   
### Special thanks to
  * Stardew Valley's creator [ConcernedApe](https://twitter.com/concernedape?lang=en)
  