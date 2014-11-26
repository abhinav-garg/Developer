#include <iostream>
#include <vector>

typedef std::vector<int> Cells;
typedef std::vector<Cells> RowOfCells;
typedef std::vector<RowOfCells> PlaneOfCells;
typedef std::vector<PlaneOfCells> SpaceOfCells;

int main()	{
	Cells cell;
	RowOfCells row;
	PlaneOfCells plane;
	SpaceOfCells space;

		// Create a row of 3 cells
	for(int k = 0; k < 3; k++)	{
		row.push_back(cell);
	}

		// Create a plane of 3 rows, therefore a 3 X 3 grid of cells
	for(int j = 0; j < 3; j++)	{
		plane.push_back(row);
	}

		// Create a space of 3 rows, therefore a 3 X 3 X 3 grid of cells
	for(int i = 0; i < 3; i++)	{
		space.push_back(plane);
	}

	// Therefore, space[][][] will give you a vector or (in loose terms) a list

	return 0;	
}
