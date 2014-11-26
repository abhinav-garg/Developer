#include <time.h>
#include <iostream>
int main()	{
	timespec ts;
	std::cout << clock_gettime(CLOCK_REALTIME, &ts) << std::endl;		// Works on LINUX
	for(int i = 0; i < 1000000000; i++)	{

	}
	std::cout << clock_gettime(CLOCK_REALTIME, &ts) << std::endl;		// Works on LINUX
			

	return 0;
}