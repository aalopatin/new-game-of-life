# Game of Life (New)
It's my new implementation of game: Game of Life

This game uses JavaFX for drawing universe of game. You have to install and set up JavaFX for running this game.

Game can accept two parameters that must be specified at the start of the game.

**1st parameter** specifies which patter we wnat to use to initialize your game.

You can use next patterns:
- growth - pattern that starts in Left Top corner of universe and growth during time.
- blinker - simple standart pattern;
- toad - simple standart pattern;
- beacon - simple standart pattern;
- pulsar - complex standart pattern;
- glinder - simple movable pattern that move through universe;
- spaceship - pattern of heavy spaceship that move through universe.

**2nd parameter** specifies speed of change of universe. By default, next generation is generated in 0.5 second. You can only use this parameter together with the 1st parameter.
