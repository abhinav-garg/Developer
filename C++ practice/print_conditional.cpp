#include <iostream>
#include <vector>
#include <fstream>
#include <string>
#include <sstream>
#include <typeinfo>
#include <cstdlib>

class Particle	{
	float x, y, z;
	public:
	Particle()	{
		x = 0; y = 0; z = 0;
	}
	Particle(float X, float Y, float Z)	{
		x = X; y = Y; z = Z;
	}
	void setCoords(float X, float Y, float Z)	{
		x = X; y = Y; z = Z;
	}
	float getX()	{
		return x;
	}
	float getY()	{
		return y;
	}
	float getZ()	{
		return z;
	}
	float distanceSquared(Particle b)	{
		float x1 = b.getX();
		float y1 = b.getY();
		float z1 = b.getZ();
		float xDiff = x - x1;
		float yDiff = y - y1;
		float zDiff = z - z1;
		return xDiff * xDiff + yDiff * yDiff + zDiff * zDiff;
	}
	bool withinDistance(Particle b, float r)	{
		bool check = this->distanceSquared(b) <= (r * r);
		return check;
	}
	void print()	{
		std::cout << "(" << x << ", " << y << ", " << z << ")" << std::endl;
	}
}	;

class ParticleAggregation	{
	std::vector<Particle> P;
	public:
	void print()	{
		for(int i = 0; i < P.size(); i++)	{
			P[i].print();
		}
	}
	void loadValues(std::string fileLocation, int MAX)	{
		std::string coordsString, coordString;
		std::ifstream inputFile;
		Particle p;
		std::stringstream ss;
		float coord[3];
		int i = 0, count = 0;
		inputFile.open(fileLocation.c_str());
		if (inputFile.is_open())	{
			while(getline(inputFile, coordsString))	{
				ss << coordsString;
				while(getline(ss, coordString, ','))	{
					coord[i] = atof(coordString.c_str());
					i++;
				}
				ss.str("");		// Flushes the string stream buffer
				ss.clear();		// Clears the EOF flag
				i = 0;
				p.setCoords(coord[0], coord[1], coord[2]);
				P.push_back(p);
				count++;
				if(count >= MAX)	break;
			}
		}
		inputFile.close();
	}
}	;


int main()	{
	int MAX = 1000000;
	ParticleAggregation P;
	P.loadValues("testSampleFile.txt", MAX);
	P.print();
}