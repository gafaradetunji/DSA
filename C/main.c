void insertion_sort(item_type s[], int n)
{
    int i, j;
    /* counters */
    for (i = 1; i < n; i++)
    {
        j = i;
        while ((j > 0) && (s[j] < s[j - 1]))
        {
            swap(&s[j], &s[j - 1]);
            j = j - 1;
        }
    }
}

// induction in computer programming

// Mathematical induction is usually the right way to verify
// the correctness of a recursive or incremental insertion algorithm