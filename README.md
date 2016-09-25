# mirrors

## Fork of mirrors by Joonas Vali 

"Mirrors" is a simulation of an arbitrary physical system, where the goal is achieved using artificial evolution. The simulation can be used to demonstrate how random mutations manage to create an overall progress towards perfection.

https://sourceforge.net/projects/jmirrors/?source=directory

Published on 29 Apr 2014 :  https://www.youtube.com/watch?v=WEZ35350D2k

Joonas Vali says "I have created a fictional physical problem, where the goal is to gather maximum amount of particles in shortest time possible. The solution is found using artificial evolution and genetic algorithms."

Software written in Java using Watchmaker for genetic algorithms and Slick2d for graphics.

This project was open sourced at 4/4/2016. Source available in bitbucket. Fork if needed.

https://bitbucket.org/jvali/mirrors


Mirrors (C) Joonas Vali  (2014-2016)

Simulation of an arbitrary physical system, where the goal is achieved using artificial evolution. 
The simulation can be used to demonstrate how random mutations manage to create an overall progress towards perfection.


Evolution

	use runner under '/bin/evolution', to start evolution.
	
	- Windows: evolution/run-evolution.cmd
	- Unix/mac: evolution/run-evolution.sh

	You might want to edit the values in evolution.properties at some point to tweak the parameters of evolution.
	Evolution is run on background, the resulting .pol files are stored by default in the mirrors root folder under 'saved'.
	Only the most successful variations from the generation are saved, rest are discarded. If generation does not provide any improvement
	the variations are not saved to avoid duplicates.
	
Show simulation

	Simulation can be shown using runner 'load' under 'bin/single'. It allows you to choose one .pol file to run.
	- Windows: single/load.cmd
	- Unix/mac: single/load.sh
	
Test random simulation
	
	Random simulation can be run using runner 'run-random' under 'bin/single' to test the engine.
	- Windows: single/run-random.cmd
	- Unix: single/run-random.sh

