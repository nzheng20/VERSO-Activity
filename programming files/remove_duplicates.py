//method remove_duplicates, takes in an array sorts it and 

def remove_duplicates(arr):
    //sorts array
    arr.sort()
    
    unique_arr = []
    removed_elements = []

    //for the elements in the array if it is the first element or
    //its not the same as the element before it, than is store it in the unique
    //array. the rest are stored in removed elements array
    for i in range(len(arr)):
        if i == 0 or arr[i] != arr[i-1]:
            unique_arr.append(arr[i])
        else:
            removed_elements.append(arr[i])
    return unique_arr, removed_elements

# Test the function
arr = [1, 2, 2, 3, 4, 4, 5]
unique_arr, removed_elements = remove_duplicates(arr)
print("Original array:", arr)
print("Unique array:", unique_arr)
print("Removed elements:", removed_elements)
