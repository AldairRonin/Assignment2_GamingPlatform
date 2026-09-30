# Assignment 2 — Gaming Platform System

## Domain
This project models a gaming platform system supporting Steam, Epic Games, Xbox, and PlayStation.

## Product types
1. GameLauncher
2. PaymentMethod
3. NotificationService

Each platform is a compatible product family.

## Design patterns

### Factory Method
`LauncherCreator` defines the factory method `createLauncher()`. Concrete creators override it to instantiate the platform-specific launcher. The creator also contains business logic in `launchGame()`.

### Abstract Factory
`GamingFactory` creates three related products:
- GameLauncher
- PaymentMethod
- NotificationService

Concrete factories:
- SteamFactory
- EpicFactory
- XboxFactory
- PlayStationFactory

Because the client receives only `GamingFactory`, the client does not instantiate concrete products.

## Runtime selection
The platform can be selected from a command-line argument:

mvn -q exec:java -Dexec.mainClass="com.example.assignment2.Main" -Dexec.args="steam"

If the exec plugin is not configured, run `Main` from the IDE and pass `steam`, `epic`, `xbox`, or `playstation` as the first program argument.

## Business operations
1. Purchase a game.
2. Launch a game.
3. Complete purchase and launch.

These operations combine multiple related products from the same family.

## Compatibility
A concrete factory creates all products belonging to one family. The client cannot request a Steam payment from an Xbox factory because it works only with the abstract `GamingFactory` and receives all products from the selected family.

## Adding Family D
PlayStation is the fourth family. It implements all three required product types. Existing `GameClient` business logic does not need to change when PlayStation is added.

## Tests
The project contains more than 15 automated tests covering:
- all four families;
- concrete product creation;
- business behavior;
- runtime selection;
- negative scenarios;
- client abstraction.

## Part A
The initial no-factory implementation should be preserved in Git history as the first development stage. It intentionally used concrete classes and conditionals to demonstrate coupling and duplicated creation logic.

## Git history
Recommended meaningful commits:
1. Initial domain model without factories
2. Add product abstractions
3. Introduce Factory Method
4. Add product families
5. Introduce Abstract Factory
6. Add runtime factory selection
7. Add tests and compatibility rules
8. Add fourth product family
