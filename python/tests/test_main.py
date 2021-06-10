from fizzbuzz.main import separator


def test_separator_index_less_than_end():
    result = separator(1, 100)
    assert(result == ',')

    result = separator(99, 100)
    assert(result == ',')

    result = separator(99, 222)
    assert(result == ',')


def test_separator_index_equals_end():
    result = separator(100, 100)
    assert(result == '')

    result = separator(1, 1)
    assert(result == '')
