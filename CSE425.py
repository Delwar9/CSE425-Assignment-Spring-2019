import pandas

csv_delimiter = ','
df = pandas.read_csv("air_quality_Nov2017.csv", sep=csv_delimiter)
pandas.set_option('display.width', 1000)


x = int(input(
          "1. Search by Air Quality\n"
          "2. Search by O3 Hour\n"
          "3. Search by O3 Quality\n"
          "4. Search by O3 value\n"
          "5. Search by NO2 Quality\n"
          "6. Search by PM10 Quality\n"
          "7. Search by DateTime\n"
          "Choose an Option: "))

def searchByAirQuality():
    air = input("Enter Air Quality: ")
    print(df[df["Air Quality"] == str(air).title()])


def searchByO3Hour():
    o3hour = input("Enter O3 Hour: ")
    print(df[df["O3 Hour"] == str(o3hour).capitalize()])


def searchByO3Quality():
    o3quality = input("Enter O3 Quality: ")
    print(df[df["O3 Quality"] == str(o3quality).title()])


def searchByO3Value():
    o3value = input("Enter O3 value: ")
    print(df[df["O3 Value"] == int(o3value)])


def searchByNO2Value():
    no2value = input("Enter NO2 value: ")
    print(df[df["NO2 Value"] == int(no2value)])


def searchByPM1OValue():
    pm10value = input("Enter PM10 value: ")
    print(df[df["PM10 Value"] == int(pm10value)])


def searchByDate():
    date = input("Enter Date from 01/11/2018 to 30/11/2018 : ")


    df["Generated"] = df["Generated"].str[:10]

    print(df[df["Generated"] == str((date)).title()])


if (x == 1):
    searchByAirQuality()

elif (x == 2):
    searchByO3Hour()

elif (x == 3):
    searchByO3Quality()

elif (x == 4):
    searchByO3Value()

elif (x == 5):
    searchByNO2Value()

elif (x == 6):
    searchByPM1OValue()

elif (x == 7):
    searchByDate()

else:
    print("Invalid Input!")

