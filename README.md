# java-def
A Java implementation for Desktop Entry Files in Linux

## Requirements
Java 14 and up

## Installation
Add the JAR file to your project.

In Gradle for example:
``implementation fileTree(dir: 'libs', include: '*.jar')``

## Usage
Create a new DesktopEntryFile object with ``new DesktopEntryFile()``. Use methods like ```.withIcon()``` to set the path to the icon.
When you are done use ``.safeToFile()`` to generate the .desktop file.

## Further Information
https://specifications.freedesktop.org/desktop-entry-spec/desktop-entry-spec-latest.html