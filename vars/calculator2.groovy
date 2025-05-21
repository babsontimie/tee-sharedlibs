def file= new File("properties.txt")
if (!file.exists()){
  println "Arguments file not found: $file.absolutePath"
  system.exit(1)
}
def props= new Properties()
props.load(new FileInputStream(file)) 

def a = props['a'].toInteger()
def b = props['b'].toInteger()

def sum = a + b
println "The sum of ${a} and ${b} is : ${sum}"


