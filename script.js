let a = [
        "Hey There is own risk",
        "Initializing Network....",
        "Connecting to service...",
        "Retreiving username...",
        "Username found....",
        "Trying a combination of 4.5 Trillion passwords...",
        "Password found...",
        "Connecting to Facebook...",
        "Hacked Succesfully",
        "Your Account is Hacked"
]

const sleep = async(seconds) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {resolve(true)}, seconds * 1000)
    })
}

const showhack = async (message) => {
    await sleep(2)
    box2.innerHTML = box2.innerHTML + message + "<br>"
}

(async () => {
    for(let i = 0; i < a.length; i++){
        await showhack(a[i])
    }
})()