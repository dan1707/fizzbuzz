from .fizzbuzz import fizz_buzz


def separator(index: int, end:int) -> str:
    sep = ',' if index < end else ''
    return sep


def print_fizz_buzz(start: int, end: int):
    for i in range(start, end + 1):
        print(f'{fizz_buzz(i)}' or i, end=separator(i, end))
    print()


def main():
    print_fizz_buzz(1, 100)


if __name__ == '__main__':
    main()
