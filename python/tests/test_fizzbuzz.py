from fizzbuzz.fizzbuzz import BUZZ, FIZZ, buzz, fizz, fizz_buzz


def test__fizz_multiple_of_3():
    result = fizz(3)
    assert (result == FIZZ)

    result = fizz(9)
    assert (result == FIZZ)


def test__fizz_not_multiple_of_3():
    result = fizz(4)
    assert (result == '')

    result = fizz(8)
    assert (result == '')


def test__buzz_multiple_of_5():
    result = buzz(5)
    assert (result == BUZZ)

    result = buzz(10)
    assert (result == BUZZ)


def test__buzz_not_multiple_of_5():
    result = buzz(7)
    assert (result == '')

    result = buzz(11)
    assert (result == '')


def test_fizz_buzz_multiple_of_3_not_5():
    result = fizz_buzz(3)
    assert (result == f'{FIZZ}')

    result = fizz_buzz(27)
    assert (result == f'{FIZZ}')


def test_fizz_buzz_multiple_of_5_not_3():
    result = fizz_buzz(5)
    assert (result == f'{BUZZ}')

    result = fizz_buzz(10)
    assert (result == f'{BUZZ}')


def test_fizz_buzz_multiple_of_3_and_5():
    result = fizz_buzz(15)
    assert (result == f'{FIZZ}{BUZZ}')

    result = fizz_buzz(30)
    assert (result == f'{FIZZ}{BUZZ}')


def test_fizzbuzz_not_multiple_of_3_and_5():
    number = 22
    result = fizz_buzz(number)
    assert (result == f'{number}')

    number = 38
    result = fizz_buzz(number)
    assert (result == f'{number}')
