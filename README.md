# SharedShoppingList

An Android app for shared shopping lists, written in Java as a university project in 2023.

## What it does

- Register and log in.
- Create shopping lists and view all of your lists.
- Add items to a list, tick them off, delete them, and refresh a list to see changes made by others.
- Item IDs are generated client-side in Base36.

## How it's built

- Native Android (Java), min SDK 27, target SDK 33; Material components and ConstraintLayout.
- Activities for welcome, new list and list view, plus login and register fragments.
- Talks to a REST backend over HTTP (`HttpHelper`: GET, POST, PUT, DELETE with JSON) for users, lists and tasks. A local SQLite helper (`DbHelper`) holds users, lists and items.

## Running it

The backend isn't part of this repository. The app's `MainActivity.BASE_URL` points at a local-network address (`http://192.168.0.35:3000`), so change it to wherever a compatible server runs. Then open the project in Android Studio and run it on a device or emulator.
