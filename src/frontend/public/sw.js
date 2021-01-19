const newCacheName = "2021-01-19";
const oldCacheName = "cache1";
const precacheResources = ["/", "index.html"];

self.addEventListener("install", event => {
  console.log("Service worker install event!");
  event.waitUntil(
    caches.open(newCacheName).then(cache => {
      return cache.addAll(precacheResources);
    })
  );
});


self.addEventListener('activate', (event) => {
    event.waitUntil(
        caches.keys().then((keys) => {
            return Promise.all(
                keys.filter(key => {
                    return key === oldCacheName;
                }).map((key) => {
                    return caches.delete(key);
                })
            );
        })
    );
});

self.addEventListener("fetch", event => {
  console.log("Fetch intercepted for:", event.request.url);
  event.respondWith(
    caches.match(event.request).then(cachedResponse => {
      if (cachedResponse) {
        return cachedResponse;
      }
      return fetch(event.request);
    })
  );
});
