#include "adamssolver.h"

AdamsSolver::AdamsSolver(double x0, double y0, double z0, double sigma, double r, double b, double dt)
    : SystemSolver (x0, y0, z0, sigma, r, b, dt)
{

}

std::vector<double> *AdamsSolver::solve(double time) {
    std::cout << "Not implemented" << std::endl;
    return nullptr;
}

AdamsSolver::~AdamsSolver() {}
