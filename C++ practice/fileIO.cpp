#include <fstream>
#include <string>

using namespace std;

int main()	{
	ifstream fin;
	string s = "testSampleFile.txt";
	fin.open(s.c_str());
	fin.close();
	return 0;
}