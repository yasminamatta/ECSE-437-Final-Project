def compute(n):
    e = 2.718281828459045
    return (e**(n*1j)).real/(e**(n*1j)).imag

