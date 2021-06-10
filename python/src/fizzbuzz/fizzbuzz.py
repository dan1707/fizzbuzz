FIZZ = 'Fizz'
BUZZ = 'Buzz'


def fizz(number: int) -> str:
    result = FIZZ if number % 3 == 0 else ''
    return result


def buzz(number: int) -> str:
    result = BUZZ if number % 5 == 0 else ''
    return result


def fizz_buzz(number: int) -> str:
    result = f'{fizz(number)}{buzz(number)}' or f'{number}'
    return result
