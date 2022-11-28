def compute(n):
    e = 2.718281828459045
    return (e**(n*1j)).real

if __name__ == "__main__":
    compute(2.98)
