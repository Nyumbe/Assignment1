service_num = [458214,256874,125474,241268,970245]
agency = ["Central Health Lab", "Baylor university","Uganda Virus Research institute", "WHO and UNICEF", "Infectious Disease Institute"]
mandate = ["National Lab Network", "Contact tracing, alert management emergency response coordination","Surveillance for zoonotic pathogens including arboviruses and viruses that cause hermorrhagic fever","Coordination and case management surveillance and contact tracing","Safe and dignified burial"]
allocated_funds = ["2.6 million","5.5 million","46 million","4 million","3.8 million"]
no_of_personnel = [89,100,50,698,41]

data = []
data.append(service_num)
data.append(agency)
data.append(mandate)
data.append(allocated_funds)
data.append(no_of_personnel)

def bin_ser(arr,x,low,high):
    while low <= high:
        mid =low + (high - low /2)
        if arr[mid]== x:
            return mid
        elif arr[mid] < x:
            low =mid + 1
        else:
            high = mid -1
    return -1

    
arr = data
x=data[3]



#Question 1d - ii
per_arr = []
for i in data[3]:
    percent = (i/100) * 100 
    per_arr.append(percent)


